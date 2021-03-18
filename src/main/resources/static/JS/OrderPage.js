window.addEventListener("load", function() {

var form = document.getElementById("orderform");

form.addEventListener("submit", function(event) {
  event.preventDefault();
  //vanilla
  var smVanValue = document.getElementById('Vanilla-SmallValue').value;
  var mdVanValue = document.getElementById('Vanilla-MediumValue').value;
  var lgVanValue = document.getElementById("Vanilla-LargeValue").value;
  var xlgVanValue = document.getElementById("Vanilla-ExtraLargeValue").value;
  var xxlgVanValue = document.getElementById("Vanilla-ExtraExtraLargeValue").value;
  //df vanilla
  var smDFVanValue = document.getElementById("DFVanilla-SmallValue").value;
  var mdDFVanValue = document.getElementById("DFVanilla-MediumValue").value;
  var lgDFVanValue = document.getElementById("DFVanilla-LargeValue").value;
  var xlgDFVanValue = document.getElementById("DFVanilla-ExtraLargeValue").value;
  var xxlgDFVanValue = document.getElementById("DFVanilla-ExtraExtraLargeValue").value;
  //Honeycomb
  var smHonValue = document.getElementById("Honeycomb-SmallValue").value;
  var mdHonValue = document.getElementById("Honeycomb-MediumValue").value;
  var lgHonValue = document.getElementById("Honeycomb-LargeValue").value;
  var xlgHonValue = document.getElementById("Honeycomb-ExtraLargeValue").value;
  var xxlgHonValue = document.getElementById("Honeycomb-ExtraExtraLargeValue").value;
  //rum n raisin
  var smRNRValue = document.getElementById("RNR-SmallValue").value;
  var mdRNRValue = document.getElementById("RNR-MediumValue").value;
  var lgRNRValue = document.getElementById("RNR-LargeValue").value;
  var xlgRNRValue = document.getElementById("RNR-ExtraLargeValue").value;
  var xxlgRNRValue = document.getElementById("RNR-ExtraExtraLargeValue").value;
  //Mint
  var smMintValue = document.getElementById("Mint-SmallValue").value;
  var mdMintValue = document.getElementById("Mint-MediumValue").value;
  var lgMintValue = document.getElementById("Mint-LargeValue").value;
  var xlgMintValue = document.getElementById("Mint-ExtraLargeValue").value;
  var xxlgMintValue = document.getElementById("Mint-ExtraExtraLargeValue").value;
  //Cherry
  var smCherryValue = document.getElementById("Cherry-SmallValue").value;
  var mdCherryValue = document.getElementById("Cherry-MediumValue").value;
  var lgCherryValue = document.getElementById("Cherry-LargeValue").value;
  var xlgCherryValue = document.getElementById("Cherry-ExtraLargeValue").value;
  var xxlgCherryValue = document.getElementById("Cherry-ExtraExtraLargeValue").value;
  //Chocolate
  var smChocValue = document.getElementById("Choc-SmallValue").value;
  var mdChocValue = document.getElementById("Choc-MediumValue").value;
  var lgChocValue = document.getElementById("Choc-LargeValue").value;
  var xlgChocValue = document.getElementById("Choc-ExtraLargeValue").value;
  var xxlgChocValue = document.getElementById("Choc-ExtraExtraLargeValue").value;
  //Salted Caramel
  var smSCValue = document.getElementById("SC-SmallValue").value;
  var mdSCValue = document.getElementById("SC-MediumValue").value;
  var lgSCValue = document.getElementById("SC-LargeValue").value;
  var xlgSCValue = document.getElementById("SC-ExtraLargeValue").value;
  var xxlgSCValue = document.getElementById("SC-ExtraExtraLargeValue").value;
  //Strawberry
  var smStrawberryValue = document.getElementById("Strawberry-SmallValue").value;
  var mdStrawberryValue = document.getElementById("Strawberry-MediumValue").value;
  var lgStrawberryValue= document.getElementById("Strawberry-LargeValue").value;
  var xlgStrawberryValue = document.getElementById("Strawberry-ExtraLargeValue").value;
  var xxlgStrawberryValue = document.getElementById("Strawberry-ExtraExtraLargeValue").value;

var order = {
    
    "Vanilla - Small" : smVanValue,
    "Vanilla - Medium" : mdVanValue,
    "Vanilla - Large" : lgVanValue,
    "Vanilla - Extra Large" : xlgVanValue,
    "Vanilla - Extra Extra Large" : xxlgVanValue,
    
    "DF Vanilla - Small" : smDFVanValue,
    "DF Vanilla - Medium" : mdDFVanValue,
    "DF Vanilla - Large" : lgDFVanValue,
    "DF Vanilla - Extra Large" : xlgDFVanValue,
    "DF Vanilla - Extra Extra Large" : xxlgDFVanValue,
    
    "Honeycomb - Small" : smHonValue,
    "Honeycomb - Medium" : mdHonValue,
    "Honeycomb - Large" : lgHonValue,
    "Honeycomb - Extra Large" : xlgHonValue,
    "Honeycomb - Extra Extra Large" : xxlgHonValue,
    
    "Rum n Raisin - Small" : smRNRValue,
    "Rum n Raisin - Medium" : mdRNRValue,
    "Rum n Raisin - Large" : lgRNRValue,
    "Rum n Raisin - Extra Large" : xlgRNRValue,
    "Rum n Raisin - Extra Extra Large" : xxlgRNRValue,
    
    "Mint - Small" : smMintValue,
    "Mint - Medium" : mdMintValue,
    "Mint - Large" : lgMintValue,
    "Mint - Extra Large" : xlgMintValue,
    "Mint - Extra Extra Large" : xxlgMintValue,
    
    "Cherry - Small" : smCherryValue,
    "Cherry - Medium" : mdCherryValue,
    "Cherry - Large" : lgCherryValue,
    "Cherry - Extra Large" : xlgCherryValue,
    "Cherry - Extra Extra Large" : xxlgCherryValue,
    
    "Chocolate - Small" : smChocValue,
    "Chocolate - Medium" : mdChocValue,
    "Chocolate - Large" : lgChocValue,
    "Chocolate - Extra Large" : xlgChocValue,
    "Chocolate - Extra Extra Large" : xxlgChocValue,
    
    "Salted Caramel - Small" : smSCValue,
    "Salted Caramel - Medium" : mdSCValue,
    "Salted Caramel - Large" : lgSCValue,
    "Salted Caramel - Extra Large" : xlgSCValue,
    "Salted Caramel - Extra Extra Large" : xxlgSCValue,

    "Strawberry - Small" : smStrawberryValue,
    "Strawberry - Medium" : mdStrawberryValue,
    "Strawberry - Large" : lgStrawberryValue,
    "Strawberry - Extra Large" : xlgStrawberryValue,
    "Strawberry - Extra Extra Large" : xxlgStrawberryValue,
};

window.localStorage.setItem('orderDetails', JSON.stringify(order));
console.log(order);

});

});