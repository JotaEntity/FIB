#include <stdio.h>

void main()
{
  int caixas = 0, peso = 0, num = 1;
  float pesomedia = 0;
  
   while(num > 0){
   	
   	printf("Adicione o peso da caixa\n");
    scanf("%i", &num);
    caixas++;
    peso+=num;

   }
   
   caixas-=1;
   peso+=1;
   printf("\nTotal de caixas: %i", caixas);
   printf("\nPeso total das caixas: %i", peso);
   pesomedia = peso / caixas;
   printf("\nPeso medio: %.2f", pesomedia);

  
   
  
  getchar();
}
