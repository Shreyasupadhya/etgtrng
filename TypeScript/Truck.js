"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Car_1 = require("./Car");
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Truck.prototype.getSalePrice = function () {
        if (this.weight > 2000) {
            return this.regularPrice = this.regularPrice * 0.9;
        }
        else {
            return this.regularPrice = this.regularPrice * 0.8;
        }
    };
    Truck.prototype.display = function () {
        console.log(this.speed);
        console.log(this.color);
        console.log(this.weight);
        console.log(this.regularPrice);
        console.log(this.getSalePrice());
    };
    return Truck;
}(Car_1.Car));
var t = new Truck();
t.speed = 80;
t.color = "red";
t.weight = 2000;
t.regularPrice = 40000;
t.display();
