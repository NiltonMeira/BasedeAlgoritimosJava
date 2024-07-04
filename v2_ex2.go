package main

import (
	"fmt"
)

func main() {

	var id int
	var score int
	var scoreSum int
	var average int
	
	fmt.Println("Enter with your id! or type 0 to exit")
	fmt.Scan(&id)

	for id > 0 {
		

		for j := 0; j < 3; j++ {
			fmt.Println("Enter with your score")
			fmt.Scan(&score)
			scoreSum = scoreSum + score
		}

		average = scoreSum/3

		if average>90 {
			fmt.Println("A")
		}else if  average > 80{
			fmt.Println("B")
		}else if  average > 70{
			fmt.Println("C")
		}else{
			fmt.Println("D")
		}
	
		fmt.Println("Enter with your id! or type 0 to exit")
		fmt.Scan(&id)
	}

}
