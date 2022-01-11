var Product = /** @class */ (function () {
    function Product() {
    }
    Product.prototype.display = function () {
        console.log(this.pid);
        console.log(this.pname);
        console.log(this.price);
    };
    Product.prototype.gstprice = function () {
        var proprice = this.price * 1.12;
        console.log(proprice);
    };
    return Product;
}());
var pr1 = new Product();
pr1.pid = 123;
pr1.pname = "xyz";
pr1.price = 123.45;
pr1.display();
pr1.gstprice();
