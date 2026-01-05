package main

import "fmt"

func linearSearch(arr []int, target int) int {
	for i, v := range arr {
		if v == target {
			return i
		}
	}
	return -1
}

func main() {
	nums := []int{10, 20, 30, 40}
	fmt.Println(linearSearch(nums, 30))
}
