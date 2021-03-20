/**
 * @description: This javascript file saves the customer's customer ID to local storage when the user signs up as they will continue to the signed-in html pages
 * @author: Tofunmi Onaeko
 * @date: 18/03/21
 * @version: 1.0
 */

window.addEventListener("load", function() {

    var submit = document.getElementById('submitButton');

    submit.addEventListener("click", function() {

        var cID = document.getElementById("email").value;

        window.localStorage.setItem('customerID', cID);

    });    

});