#include <stdio.h>
#include <locale.h>

int main()
{
	printf("",setlocale(LC_ALL,""));
	 int salarios = 0,sMaior = 1, total = 0, sMenor = 1, num = 1, maior = 0;
	 
	  while(num != 0){
	 	printf("Digite o salário\n");
	 	scanf("%i", &num);
	 	if (num == 0){
	 		break;
		 }
	 	total+=num;
	 	salarios +=1;
	 	if(sMaior == 1 && sMenor == 1){
	 		sMaior = num;
	 		sMenor = num;
	 }
        if (num > sMaior){
        	sMaior = num;
		} else if(num < sMenor){
			sMenor = num;
		}
		if (num > 2000){
			maior+=1;
		}
	 }
	 printf("\nMaior salário %i", sMaior);
	 printf("\nMenor salário %i", sMenor);
	 printf("\nTotal de salário %i", total);
	 printf("\nSalários maior que R$2.000: %i", maior);


return 0;
}
	 
	


