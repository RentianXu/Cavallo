
if (document.readyState == 'loading') {
    document.addEventListener('DOMContentLoaded', ready)
} else {
    ready()

}

function ready() {

    var removeItems = document.getElementsByClassName('btn-danger-remove')
    for (var i = 0; i < removeItems.length; i++) {
        var button = removeItems[i]
        button.addEventListener('click', function (event) {
            var buttonClick = event.target
            buttonClick.parentElement.parentElement.remove()
            //updateCartTotal()
        })
    }

    var quantityInputs = document.getElementsByClassName('cart-quantity-input')
    for (var i = 0; i < quantityInputs.length; i++) {
        var input = quantityInputs[i]
        input.addEventListener('change', quantityChanged)
    }

    var addToCartButtons = document.getElementsByClassName('btn-warning')
    console.log(addToCartButtons)

    for (var i = 0; i < addToCartButtons.length; i++) {
        var button = addToCartButtons[i]
        //button.value = "selectbasicC"
        button.addEventListener('click', addToCartClicked)
    }
}

function updateCartTotal() {
    var cartItemContainer = document.getElementsByClassName('cart-items')[0]
    var cartRows = cartItemContainer.getElementsByClassName('cart-row')
    var total = 0
    for (var i = 0; i < cartRows.length; i++) {
        var cartRow = cartRows[i]
        var priceElement = cartRow.getElementsByClassName('cart-price')[0]
        var quantityElement = cartRow.getElementsByClassName('cart-quantity-input')[0]
        var price = parseFloat(priceElement.innerText.replace('£', ''))
        var quantity = quantityElement.value 
        total = total + (price * quantity)
    }
    total = Math.round(total * 100) / 100
    document.getElementsByClassName('cart-total-price')[0].innerText = '£' + total
}

function quantityChanged(event) {
    var input = event.target
    if (isNaN(input.value) || input.value <= 0) {
        input.value = 1
    }
    updateCartTotal()
}

// anything above here works 

function addToCartClicked(event) {
var button = event.target

   
    // var buttonLink = new Object();
    // buttonLink = {'shop-item-button-CH': 'selectbasicCH', 'shop-item-button-S': 'selectbasicS',
    //         'shop-item-button-V': 'selectbasicV', 'shop-item-button-R': 'selectbasicR',
    //         'shop-item-button-M': 'selectbasicM','shop-item-button-SC': 'selectbasicSC',
    //         'shop-item-button-H': 'selectbasicH','shop-item-button-C': 'selectbasicC'}

   

    // var buttonKey = button.className.split(" ")[3]
    // var butttonValue = buttonLink[buttonKey]

    // var e = document.getElementById(butttonValue);
    // var result = e.options[e.selectedIndex].text;
    // var f = document.getElementById(butttonValue);
    // var value = f.options[f.selectedIndex].value;
    //console.log(result)

    console.log(value)
    addItemToCart(result, value)
    updateCartTotal()
}


function addItemToCart(title, value) {
    var cartRow = document.createElement('div')
    cartRow.classList.add('cart-row')
    var cartItems = document.getElementsByClassName('cart-items')[0]
    var cartItemNames = cartItems.getElementsByClassName('cart-item-title')


    var cartRowContents = `
        <div class="cart-item cart-column">
            
            <span class="cart-item-title">${title}</span>
        </div>
        <span class="cart-price cart-column">${value}</span>
        <div class="cart-quantity cart-column">
            // <input class="cart-quantity-input" type="number" value="1">
            <button class="btn btn-danger-remove" type="button">Remove</button>
        </div>`


    cartRow.innerHTML = cartRowContents
    cartItems.append(cartRow)
    cartRow.getElementsByClassName('btn-danger-remove')[0].addEventListener('click', removeCartItem)
    cartRow.getElementsByClassName('cart-quantity-input')[0].addEventListener('change', quantityChanged)
}


function removeCartItem(event) {
    var buttonClicked = event.target
    buttonClicked.parentElement.parentElement.remove()
    updateCartTotal()
}













//alculating price from list of product

// function calculateOrder(form) {


//     //vanilla

//     if (form.osO.value == 'small vanilla £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small vanilla';

//     }
//     if (form.osO.value == 'medium vanilla £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium vanilla';

//     }

//     if (form.osO.value == 'large vanilla £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large vanilla';

//     }
//     if (form.osO.value == 'extra large vanilla £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large vanilla';

//     }
//     if (form.osO.value == 'XXL vanilla £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL vanilla';

//     }
//     //dairy free vanilla
//     if (form.osO.value == 'small DF vanilla £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small DF vanilla';

//     }
//     if (form.osO.value == 'medium DF vanilla £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium DF vanilla';

//     }
//     if (form.osO.value == 'large DF vanilla £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large DF vanilla';

//     }
//     if (form.osO.value == 'extra large DF vanilla £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large DF vanilla';

//     }
//     if (form.osO.value == 'XXL DF vanilla £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL DF vanilla';

//     }
//     //honeycomb
//     if (form.osO.value == 'small honeycomb £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small honeycomb';

//     }
//     if (form.osO.value == 'medium honeycomb £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium honeycomb';

//     }
//     if (form.osO.value == 'large honeycomb £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large honeycomb';

//     }
//     if (form.osO.value == 'extra large honeycomb £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large honeycomb';

//     }
//     if (form.osO.value == 'XXL honeycomb £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXl honeycomb';

//     }
//     //rum and raisin
//     if (form.osO.value == 'small rum and raisin £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small rum and raisin';

//     }
//     if (form.osO.value == 'medium rum and raisin £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium rum and raisin ';

//     }
//     if (form.osO.value == 'large rum and raisin  £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large rum and raisin';

//     }
//     if (form.osO.value == 'extra large rum and raisin £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large rum and raisin ';

//     }
//     if (form.osO.value == 'XXL rum and raisin £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL rum and raisin';

//     }
//     //mint
//     if (form.osO.value == 'small mint £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small mint';

//     }
//     if (form.osO.value == 'medium mint £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium mint';

//     }
//     if (form.osO.value == 'large mint £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large mint ';

//     }
//     if (form.osO.value == 'extra large mint £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large mint ';

//     }
//     if (form.osO.value == 'XXL mint £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL mint ';

//     }
//     //cherry
//     if (form.osO.value == 'small cherry £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small cherry';

//     }
//     if (form.osO.value == 'medium cherry £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium cherry';

//     }
//     if (form.osO.value == 'large cherry £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large cherry';

//     }
//     if (form.osO.value == 'extra large cherry £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large cherry';

//     }
//     if (form.osO.value == 'XXL cherry £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL cherry';

//     }
//     //strawberry
//     if (form.osO.value == 'small strawberry £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small strawberry';

//     }
//     if (form.osO.value == 'medium strawberry £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium strawberry';

//     }
//     if (form.osO.value == 'large strawberry £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large strawberry';

//     }
//     if (form.osO.value == 'extra large strawberry £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large strawberry';

//     }
//     if (form.osO.value == 'XXL strawberry £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL strawberry';

//     }
//     //chocolate
//     if (form.osO.value == 'small chocolate £1.75') {
//         form.amount.value = 1.75;
//         form.item_number.value = 'small chocolate';

//     }
//     if (form.osO.value == 'medium chocolate £2.25') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium chocolate';

//     }
//     if (form.osO.value == 'large chocolate £2.75') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large chocolate';

//     }
//     if (form.osO.value == 'extra large chocolate £3.50') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large chocolate';

//     }
//     if (form.osO.value == 'XXL chocolate £5.75') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL chocolate';

//     }
//     //salted caramel
//     if (form.osO.value == 'small salted caramel £2.50') {
//         form.amount.value = 2.50;
//         form.item_number.value = 'small salted caramel';

//     }
//     if (form.osO.value == 'medium salted caramel £3.00') {
//         form.amount.value = 2.25;
//         form.item_number.value = 'medium salted caramel';

//     }
//     if (form.osO.value == 'large salted caramel £3.50') {
//         form.amount.value = 2.75;
//         form.item_number.value = 'large salted caramel';

//     }
//     if (form.osO.value == 'extra large salted caramel £4.25') {
//         form.amount.value = 3.50;
//         form.item_number.value = 'extra large salted caramel';

//     }
//     if (form.osO.value == 'XXL salted caramel £6.50') {
//         form.amount.value = 5.75;
//         form.item_number.value = 'XXL salted caramel';

//     }

// }

