<?php
class Car
{
  public $id;
  public $license;
  public $driver;
  public $passenger;

  public function __construct(string $license = '', object $driver = null)
  {
    $this->license = $license;
    $this->driver =  $driver;
  }
  public function printDataCar(): void
  {
    $name = $this->driver->name;
    $document = $this->driver->document;
    echo "License: $this->license. Driver: $name. Document: $document. Passengers: $this->passenger <hr>";
  }
}
