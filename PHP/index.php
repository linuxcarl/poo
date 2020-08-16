<?php
require_once "./Account.php";
require_once "./Car.php";

require_once "./UberBlack.php";
require_once "./UberVan.php";
require_once "./UberX.php";
require_once "./UberPool.php";

$car =  new Car("zdf-23s-23", new Account("Carlos Ramirez", "dr10"));
$car->passenger = 5;
$car->printDataCar();


$uberX = new UberX("ZFS-23D-23", new Account("Marcela Ramirez Flores", "JDF-32D"),"Honda",'Civic 2021');
$uberX->passenger = 4;
$uberX->printDataCar();

$UberPool = new UberPool("CFA-23D-23", new Account("Guadalupe Ramirez Flores", "gdl-32D"),"Chevrolet",'Sonic 2021');
$UberPool->passenger = 4;
$UberPool->printDataCar();