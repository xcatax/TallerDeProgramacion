{El supermercado “Super” tiene 5 sucursales y necesita procesar el stock de los productos de las distintas sucursales.
Para ello ya se dispone de un módulo “Generar” que lee la información de los productos y genera una estructura con código de producto,
descripción, stock y precio, agrupados por sucursal. Para cada sucursal, los productos se encuentran ordenados por código de producto.
De cada producto se lee: código de sucursal (1..5), código de producto, stock y precio. La lectura finaliza con el código de producto 0,
el cual no se procesa.
Se pide implementar un programa en Pascal que invoque:
Al módulo “Generar”.
A un módulo que reciba la estructura generada en a) y retorne una lista que contenga para cada producto, el código del producto, el stock máximo y
el código de sucursal que tiene dicho stock.}
program FinalAbrilSuperMaximo;
const
  valor_alto=9999;
type
  rango=1..5;
  productos=record
    codigo:integer;
    descripcion:string[20];
    stock:integer;
    precio:integer;
    sucursal:rango;
  end;

  productosLista=record
    codigo:integer;            //para leer
    descripcion:string[20];
    stockMax:integer;
    precio:integer;
    sucursal:rango;
  end;

  lista=^nodo;
  nodo=record
    dato:productosLista;
    sig:lista;
  end;

  vector=array[rango] of lista;


  actual=Record
   codigoProd:integer;
   stockMax:integer;
   codigoSuc:rango;
  end;

listaNue=^nodoN;
 nodoN=record
    datoN:actual;
    sig:listaNue;
 end;
procedure leerProducto(var p:productos);
begin
    write('Codigo Producto: ');
    readln(p.codigo);
    if(p.codigo<>0)then begin
      write('Descripcion: ');
      readln(p.descripcion);
      write('Stock: ');
      readln(p.stock);
      write('Precio: ');
      readln(p.precio);
      write('Sucursal de 1..5: ');
      readln(p.sucursal);
    end;
end;

procedure insertarOrdenado(var l:lista; pL:productosLista);
var
  nue,ant,act:lista;
begin
    new(nue);
    nue^.dato:=pL;
    act:=l;
    while(act<>NIL) and(l^.dato.codigo < pL.codigo)do begin
      ant := act;
      act := act^.sig;
    end;
    if(act=l)then
       l:=nue
    else
        ant^.sig:= nue;
    nue^.sig:=act;
end;

procedure inicializarVector(var v:vector);
var i:integer;
begin
   for i := 1 to 5 do
       v[i]:=nil;
end;

procedure cargarVectorListas(var v:vector );
var
  pL:productosLista;
  p:productos;
begin
    leerProducto(p);
    while(p.codigo<>0)do begin
      pL.codigo:=p.codigo;
      pL.descripcion:=p.descripcion;
      pL.precio:=p.precio;
      pL.stockMax:=p.stock;
      insertarOrdenado(v[p.sucursal],pL);
      leerProducto(p);
    end;
end;

procedure imprimirLista(l:lista);
begin
  while (l <> nil) do begin
      writeln ('Codigo de producto : ', l^.dato.codigo);
      writeln ('Descripcion : ', l^.dato.descripcion);
      writeln ('Precio: ',l^.dato.precio);
      writeln ('Stock: ',l^.dato.stockMax);
      writeln (' ----------------- ');
      l:= l^.sig;
  end;
end;

procedure imprimirVec(v:vector);
var
   i:integer;
begin
  for i:=1 to 5 do begin
    writeln('__________________________________');
    writeln('Sucursal  ',i);
    if (v[i]<> nil) then
       imprimirlista(v[i])
    else
       writeln('No hay elementos en esta lista');
    writeln('__________________________________');
  end;
end;

{A un módulo que reciba la estructura generada en a) y retorne una lista que contenga para cada producto, el código del producto, el stock máximo y
el código de sucursal que tiene dicho stock.}

procedure determinarMinimo (var v:vector; var min:productosLista);
var
   i,posmin:integer;
begin
    min.codigo:= valor_alto;
    for i:= 1 to 5 do begin
       if (v[i] <> nil) then begin
           if (v[i]^.dato.codigo < min.codigo) then begin
              min.codigo:=v[i]^.dato.codigo;
              min.sucursal:=i;
              min.stockMax:= v[i]^.dato.stockMax;
              posmin:= i;

           end;
         end;
     end;
     if (min.codigo <> 9999) then
	v[posmin]:=v[posmin]^.sig;

end;


procedure AgregarAlFinal(var l, ult:listaNue; act:actual);
var
    nue:listaNue;
begin
    new (nue);
    nue^.datoN:=act;
    nue^.sig:= nil;
    if (l=nil) then
        l:=nue
    else
        ult^.sig:=nue;
    ult:= nue;
end;


procedure merge(v:vector; var ln:listaNue);
var
   min:productosLista;
   ult:listaNue;
   act:actual;
begin
  ult:=nil;
  determinarMinimo(v,min);
  while (min.codigo <> valor_alto) do begin
     act.codigoProd:=min.codigo;
     act.stockMax:=min.stockMax;
     act.codigoSuc:=min.sucursal;
     while (act.codigoProd = min.codigo) do begin
        if (act.stockMax < min.stockMax) then begin
           act.stockMax:= min.stockMax;
           act.codigoSuc:=min.sucursal;
        end;
        determinarMinimo(v,min);
     end;
     AgregarAlFinal(ln, ult ,act);

     end;

  end;

procedure imprimirListaNue(lN:listaNue);
begin
  while (lN <> nil) do begin
      writeln ('Codigo de producto : ', lN^.datoN.codigoProd);
      writeln ('Codigo Sucursal : ', lN^.datoN.codigoSuc);
      writeln ('Stock maximo: ',lN^.datoN.stockMax);
      writeln (' ----------------- ');
      lN:= lN^.sig;
  end;
end;


var
  v:vector;
  p:productos;
  lN:listaNue;
begin
 lN:=nil;
 inicializarVector(v);
 cargarVectorListas(v);
 imprimirVec(v);
 merge(v,ln);
 imprimirListaNue(lN);
 readln();
 readln();
end.


