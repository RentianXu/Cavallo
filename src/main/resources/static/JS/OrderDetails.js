/**
 * @description: This javascript file reviews the order information generated by the order page and streamlines it, removing all blank entries
 * @author: Tofunmi Onaeko
 * @date: 15/03/21
 * @version: 1.0
 */

window.addEventListener("load", function() {

    var order = JSON.parse(window.localStorage.getItem('orderDetails'));
    var submit = document.getElementById('submitButton');

    submit.addEventListener("click", function() {

        //The code below looks through each flavour and size, if the order does not contain this flavour and size, it is removed from the order object
        if(order["Vanilla - Small"] == 0) {
            delete order["Vanilla - Small"];
        }

        if(order["Vanilla - Medium"] == 0) {
            delete order["Vanilla - Medium"];
        }

        if(order["Vanilla - Large"] == 0) {
            delete order["Vanilla - Large"];
        }

        if(order["Vanilla - Extra Large"] == 0) {
            delete order["Vanilla - Extra Large"];
        }

        if(order["Vanilla - Extra Extra Large"] == 0) {
            delete order["Vanilla - Extra Extra Large"];
        }

        if(order["DF Vanilla - Small"] == 0) {
            delete order["DF Vanilla - Small"];
        }

        if(order["DF Vanilla - Medium"] == 0) {
            delete order["DF Vanilla - Medium"];
        }

        if(order["DF Vanilla - Large"] == 0) {
            delete order["DF Vanilla - Large"];
        }

        if(order["DF Vanilla - Extra Large"] == 0) {
            delete order["DF Vanilla - Extra Large"];
        }

        if(order["DF Vanilla - Extra Extra Large"] == 0) {
            delete order["DF Vanilla - Extra Extra Large"];
        }

        if(order["Honeycomb - Small"] == 0) {
            delete order["Honeycomb - Small"];
        }

        if(order["Honeycomb - Medium"] == 0) {
            delete order["Honeycomb - Medium"];
        }

        if(order["Honeycomb - Large"] == 0) {
            delete order["Honeycomb - Large"];
        }

        if(order["Honeycomb - Extra Large"] == 0) {
            delete order["Honeycomb - Extra Large"];
        }

        if(order["Honeycomb - Extra Extra Large"] == 0) {
            delete order["Honeycomb - Extra Extra Large"];
        }

        if(order["Rum n Raisin - Small"] == 0) {
            delete order["Rum n Raisin - Small"];
        }

        if(order["Rum n Raisin - Medium"] == 0) {
            delete order["Rum n Raisin - Medium"];
        }

        if(order["Rum n Raisin - Large"] == 0) {
            delete order["Rum n Raisin - Large"];
        }

        if(order["Rum n Raisin - Extra Large"] == 0) {
            delete order["Rum n Raisin - Extra Large"];
        }

        if(order["Rum n Raisin - Extra Extra Large"] == 0) {
            delete order["Rum n Raisin - Extra Extra Large"];
        }
    
        if(order["Mint - Small"] == 0) {
            delete order["Mint - Small"];
        }

        if(order["Mint - Medium"] == 0) {
            delete order["Mint - Medium"];
        }

        if(order["Mint - Large"] == 0) {
            delete order["Mint - Large"];
        }

        if(order["Mint - Extra Large"] == 0) {
            delete order["Mint - Extra Large"];
        }

        if(order["Mint - Extra Extra Large"] == 0) {
            delete order["Mint - Extra Extra Large"];
        }

        if(order["Cherry - Small"] == 0) {
            delete order["Cherry - Small"];
        }

        if(order["Cherry - Medium"] == 0) {
            delete order["Cherry - Medium"];
        }

        if(order["Cherry - Large"] == 0) {
            delete order["Cherry - Large"];
        }

        if(order["Cherry - Extra Large"] == 0) {
            delete order["Cherry - Extra Large"];
        }

        if(order["Cherry - Extra Extra Large"] == 0) {
            delete order["Cherry - Extra Extra Large"];
        }
    
        if(order["Chocolate - Small"] == 0) {
            delete order["Chocolate - Small"];
        }

        if(order["Chocolate - Medium"] == 0) {
            delete order["Chocolate - Medium"];
        }

        if(order["Chocolate - Large"] == 0) {
            delete order["Chocolate - Large"];
        }

        if(order["Chocolate - Extra Large"] == 0) {
            delete order["Chocolate - Extra Large"];
        }

        if(order["Chocolate - Extra Extra Large"] == 0) {
            delete order["Chocolate - Extra Extra Large"];
        }

        if(order["Salted Caramel - Small"] == 0) {
            delete order["Salted Caramel - Small"];
        }

        if(order["Salted Caramel - Medium"] == 0) {
            delete order["Salted Caramel - Medium"];
        }

        if(order["Salted Caramel - Large"] == 0) {
            delete order["Salted Caramel - Large"];
        }

        if(order["Salted Caramel - Extra Large"] == 0) {
            delete order["Salted Caramel - Extra Large"];
        }

        if(order["Salted Caramel - Extra Extra Large"] == 0) {
            delete order["Salted Caramel - Extra Extra Large"];
        }

        if(order["Strawberry - Small"] == 0) {
            delete order["Strawberry - Small"];
        }

        if(order["Strawberry - Medium"] == 0) {
            delete order["Strawberry - Medium"];
        }

        if(order["Strawberry - Large"] == 0) {
            delete order["Strawberry - Large"];
        }

        if(order["Strawberry - Extra Large"] == 0) {
            delete order["Strawberry - Extra Large"];
        }

        if(order["Strawberry - Extra Extra Large"] == 0) {
            delete order["Strawberry - Extra Extra Large"];
        }

        console.log(order);

        //The code below takes the streamlined order object and creates a JSON file
        var orderDetails = JSON.stringify(order);

        //The code block below takes the streamlined order object created and sends it to the server using a post request
        //const http = new XMLHttpRequest();
        //const url = ;
        //http.open("POST", url, true);
        //http.send(orderDetails);

    });

});