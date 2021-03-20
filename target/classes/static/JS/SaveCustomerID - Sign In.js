/**
 * @description: This javascript file saves the customer's customer ID to local storage when the user signs in
 * @author: Tofunmi Onaeko
 * @date: 14/03/21
 * @version: 1.0
 */

window.addEventListener("load", function() {

    var submit = document.getElementById('submitButton');

    submit.addEventListener("click", function() {

        var cID = document.getElementById("username").value;

        window.localStorage.setItem('customerID', cID);

    });    

});