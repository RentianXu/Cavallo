/**
 * @description: This javascript file sends the correct information for an order to the server, but as the customer is signed out,
 * the customers first and last name are sent to the server.
 * @author: Tofunmi Onaeko
 * @date: 19/03/21
 * @version: 4.0
 */

window.addEventListener("load", function() {

    //When the customer signs in a copy of their username is saved to local storage, the code below retrieves the customer ID from local storage
    var cID = window.localStorage.getItem('customerID');
    console.log(cID);

    var submit = document.getElementById("submitButton")

    submit.addEventListener("click", function() {

        var address;
        var order_type;
        var transactionAmount = JSON.parse(window.localStorage.getItem('total'));

        //If the customer has selected home delivery then the order type is set to home delivery and their address details are added to the order file, 
        //if pickup is selected, pickup is returned, else this area of the order object will be blank and the order will be rejected when the customer tries to pay.
        if (document.getElementById("homedelivery").checked) {
            order_type = "delivery";
            
        } else if(document.getElementById("pickup").checked){
            order_type = "pickup";

        } else if(document.getElementById("homedelivery1").checked){
            order_type = "delivery";

        } else if(document.getElementById("pickup1").checked){
            order_type = "pickup";

        } else {
            order_type = "there's a problem";

        }

        //The code below creates an order object
        var order = {
            "customerId" : cID,
            "order_type" : order_type,
            "transactionAmount" : transactionAmount
        }

        console.log(order);
        //The code below takes the order object created and creates a JSON file
        var orderSignedIn = JSON.stringify(order);

        //The code block below takes the JSON object created and sends it to the server using a post request
        const http = new XMLHttpRequest();
        //url missing below
        //const url = ;
        http.open("POST", url, true);
        http.send(orderSignedIn);

    });    

});