/**
 * @description: This javascript file enables and disables the address fields in the payment form depending on which radio button is clicked, Home delivery or self pick up
 * @author: Tofunmi Onaeko
 * @date: 17/03/21
 * @version: 1.0
 */

window.addEventListener("load", function() {

    document.getElementById("homedelivery").onclick = function enable() {
        document.getElementById("buildingname").disabled = false;
        document.getElementById("postcode").disabled = false;
        document.getElementById("streetaddress").disabled = false;    
    }

    document.getElementById("pickup").onclick = function disable() {
        document.getElementById("buildingname").disabled = true;
        document.getElementById("postcode").disabled = true;
        document.getElementById("streetaddress").disabled = true; 
    }

    document.getElementById("homedelivery1").onclick = function enable() {
        document.getElementById("buildingname1").disabled = false;
        document.getElementById("postcode1").disabled = false;
        document.getElementById("streetaddress1").disabled = false;    
    }

    document.getElementById("pickup1").onclick = function disable() {
        document.getElementById("buildingname1").disabled = true;
        document.getElementById("postcode1").disabled = true;
        document.getElementById("streetaddress1").disabled = true; 
    }

});
