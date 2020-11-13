#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

void main()
{
	int clientes, produtos, laco=0; 
	float total, preco;
	printf("",setlocale(LC_ALL,""));
	printf("\nClientes que irão comprar:\n");
	scanf("%i", &clientes);
	while(clientes--){
		printf("\nQuantos produros irá comprar?\n");
		scanf("%i", &produtos);
		
		for (laco = 1; laco <= produtos; laco++){
			printf("\nPreço dos produtos:");
			scanf("%f",&preco);
			total+=preco;
		}
		
		printf("\nValor total da sua compra: %.2f", total);
		total=0;
	 
	}
	
	
getchar();	
}

