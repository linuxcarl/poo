<?php
require_once('Car.php');

class UberPool extends Car
{
    public $brand;
    public $model;

    public function __construct(string $license = null, object $driver = null, string $brand = null, string $model = null)
    {
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}
