#include <stdio.h>
#include <stdlib.h>

/*  Queremos verificar uma serie de datas, se todas elas 
    são representam datas válidas e imprimir elas em ordem 
    cronológica. */

typedef struct {
    int dia, mes, ano;
}sDatas;

int verificaData (sDatas data) {
    if (data.mes < 1 || data.mes > 12) return 0;
    if (data.dia < 1 || data.dia > 31) return 0;
    if (data.mes == 2) {
        //Anos terminados em 00 tem que ser divisíveis por 400 para serem bissextos
        int bissexto = (data.ano % 4 == 0 && data.ano % 100 != 0) || (data.ano % 400 == 0);
        if (data.dia > 29 || (data.dia == 29 && !bissexto)) return 0;
    }
    if ((data.mes == 4 || data.mes == 6 || data.mes == 9 || data.mes == 11) && data.dia > 30) return 0;
    if (data.ano % 4 == 0 && data.mes == 2 && data.dia > 29) return 0;
    return 1;
}

sDatas* alocaLista (int nDatas) {
    sDatas* lista;
    lista = (sDatas*) malloc (nDatas*sizeof (sDatas));
    if (lista ==NULL) {
        perror ("Erro na alocacao de memoria.\n");
        exit (1);
    }
    return lista;
}

//função para ordenação

void entradaDatas (sDatas* datas, int nDatas) {
    for (int i = 0; i<nDatas; i++) {
        printf ("Digite data %d (dd/mm/aa): ", i+1);
        scanf ("%d/%d/%d", &datas[i].dia, &datas[i].mes, &datas[i].ano);
        if (!verificaData(datas[i])) {
            printf ("Data invalida, tente novamente.\n\n");
            i--;
        }
    }
}

void imprimirDatas (sDatas* datas, int nDatas) {
    printf ("\n");
    for (int i = 0; i<nDatas; i++) {
        printf ("Data %d: %02d/%02d/%04d\n", i+1, datas[i].dia, datas[i].mes, datas[i].ano);
    }
}


int main () {
    int nDatas = 0;
    printf ("Quantas datas serao inseridas? ");
    scanf ("%d", &nDatas);
    printf ("\n");
    sDatas* datas = alocaLista (nDatas);
    entradaDatas (datas, nDatas);
    imprimirDatas (datas, nDatas);
    free (datas);
    return 0;
}