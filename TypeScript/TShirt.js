var TShirt = /** @class */ (function () {
    function TShirt(c, m, d, s) {
        this.color = c;
        this.material = m;
        this.design = d;
        this.size = s;
    }
    TShirt.prototype.display = function () {
        console.log("Color=" + this.color);
        console.log("Design=" + this.design);
        console.log("Material=" + this.material);
        console.log("Size" + this.size);
    };
    return TShirt;
}());
var t1 = new TShirt("blue", "cotton", "plain", "small");
t1.display();
var t2 = new TShirt("red", "woolen", "checks", "large");
t2.display();
var t3 = new TShirt("green", "nylon", "box", "Xtra-Large");
t3.display();
