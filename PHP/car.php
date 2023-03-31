<?php
class Car{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    public function PrintDataCar(){
        echo "license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
    }
}