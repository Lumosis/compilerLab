#include<stdio.h>
#include<stdlib.h>
#include<string.h>

void main(){
    FILE *stream;
    char ch;
    int state=0;
    int position=0;
    stream = fopen("input.txt","r");
    if(stream == NULL){
        printf("文件打开失败！\n");
        exit(0);
    }

    while(1){
        fgetc(stream);
        if(feof(stream) != 0){
            if(state == 1)
                printf("识别出<,起%d，止%d\n",position,position);
            else if(state == 5){
                printf("识别出=,起%d，止%d\n",position,position);
            }
            else if(state == 6){
                printf("识别出>,起%d，止%d\n",position,position);
            }
            break;
        }
        fseek(stream, -1, SEEK_CUR);
        ch = fgetc(stream);
        position++;
        switch(state){
            case 0:{
                if(ch == '<')
                    state = 1;
                else if(ch == '=')
                    state = 5;
                else if(ch == '>')
                    state = 6;
                else
                    state = 0;//读入的不是关系符
                break;
            }
            case 1:{
                if(ch == '=')
                    state = 2;
                else if(ch == '>')
                    state = 3;
                else{
                    state = 4;
                    fseek(stream, -1, SEEK_CUR);
                    position--;
                }
                break;
            }
            case 2:{
                fseek(stream, -1, SEEK_CUR);
                position--;
                printf("识别出<=,起%d，止%d\n",position-1,position);
                state = 0;
                break;
            }
            case 3:{
                fseek(stream, -1, SEEK_CUR);
                position--;
                printf("识别出<>(不等于),起%d，止%d\n",position-1,position);
                state = 0;
                break;
            }
            case 4:{
                fseek(stream, -1, SEEK_CUR);
                position--;
                printf("识别出<,起%d，止%d\n",position,position);
                state = 0;
                break;
            }
            case 5:{
                fseek(stream, -1, SEEK_CUR);
                position--;
                printf("识别出=,起%d，止%d\n",position,position);
                state = 0;
                break;
            }
            case 6:{
                if(ch == '=')
                    state = 7;
                else{
                    state = 8;
                    fseek(stream, -1, SEEK_CUR);
                    position--;
                }
                break;
            }
            case 7:{
                fseek(stream, -1, SEEK_CUR);
                position--;
                printf("识别出>=,起%d,止%d\n",position-1,position);
                state = 0;
                break;
            }
            case 8:{
                fseek(stream, -1, SEEK_CUR);
                position--;
                printf("识别出>,起%d，止%d\n",position,position);
                state = 0;
                break;
            }
            default:
                printf("ERROR！\n");
                break;
        }
        

    }

    fclose(stream);
}