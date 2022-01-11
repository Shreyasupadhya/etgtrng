var Arrayex = /** @class */ (function () {
    function Arrayex() {
        this.numarr = [1, 2, 3, 4];
    }
    Arrayex.prototype.find = function () {
        for (this.i = 0; this.i < this.numarr.length; this.i = this.i + 1) {
            if (5 == this.numarr[this.i]) {
                console.log("number found");
            }
        }
    };
    return Arrayex;
}());
var arr = new Arrayex();
arr.find();
