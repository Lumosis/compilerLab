#!/bin/bash
gcc -E test.c -m32 -o test32.i   
  
gcc -E test.c -m64 -o test64.i  

gcc -S test32.i -m32 -o test32.asm  

  
gcc -S test64.i -m64 -o test64.asm  
  
gcc -c test.c -m32 -o test32.o    
  
gcc -c test.c -m64 -o test64.o  

gcc -o test32 -m32 test.c

gcc -o test64 -m64 test.c