function addToCart(productId) {
    fetch(`/cart/add?productId=${productId}`, {
        method: 'POST'
    })
    .then(response => {
        if (response.ok) {
            alert("Produs adăugat în coș!");
        } else {
            alert("Eroare la adăugarea produsului.");
        }
    })
    .catch(error => console.error('Error:', error));
}
