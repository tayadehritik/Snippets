data segment
num1 db 01h,02h,03h,04h,05
num2 db 5 dup(0)
data ends
code segment
assume cs:code,ds:data
start:
        mov ax,data
        mov ds,ax
        mov cl,04h
        lea si,num1
        lea di,num2
    up: mov al,[si]
        mov [di],al
        inc si
        inc di
        dec cl
        jnz up
        code ends
        end start

