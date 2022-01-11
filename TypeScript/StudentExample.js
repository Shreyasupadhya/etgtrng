var StudentExample = /** @class */ (function () {
    function StudentExample(i, n, m) {
        this.stdID = i;
        this.stdName = n;
        this.stdClass = m;
    }
    StudentExample.prototype.display = function () {
        console.log(this.stdID);
        console.log(this.stdName);
    };
    return StudentExample;
}());
var s = new StudentExample(2, "def", 5);
s.display();
