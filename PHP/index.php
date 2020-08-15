<?php
require_once "./Account.php";
require_once "./Car.php";

$car =  new Car("zdf-23s-23", new Account("Carlos Ramirez", "dr10"));
$car->passenger = 5;
$car->printDataCar();
