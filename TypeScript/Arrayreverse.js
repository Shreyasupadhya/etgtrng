var Arrayreverse = /** @class */ (function () {
    function Arrayreverse() {
        this.arr = [1, 2, 3, 4].reverse();
    }
    Arrayreverse.prototype.display = function () {
        console.log(this.arr);
    };
    return Arrayreverse;
}());
var a = new Arrayreverse();
a.display();
