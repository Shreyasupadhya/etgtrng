var Greater = /** @class */ (function () {
    function Greater() {
        this.a = 12;
        this.b = 25;
        this.c = 89;
    }
    Greater.prototype.greatest = function () {
        if (this.a > this.b && this.a > this.c) {
            this.res = this.a;
            console.log(this.res);
        }
        else if (this.b > this.a && this.b > this.c) {
            this.res = this.b;
            console.log(this.res);
        }
        else {
            this.res = this.c;
            console.log(this.res);
        }
    };
    return Greater;
}());
var g = new Greater();
g.greatest();
