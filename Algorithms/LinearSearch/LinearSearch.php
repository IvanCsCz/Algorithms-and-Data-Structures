<?php

function linearSearch(array $arr, int $target): int {
    foreach ($arr as $index => $value) {
        if ($value === $target) {
            return $index;
        }
    }
    return -1;
}

$numbers = [10, 20, 30, 40];

$result = linearSearch($numbers, 30);
echo $result . PHP_EOL;