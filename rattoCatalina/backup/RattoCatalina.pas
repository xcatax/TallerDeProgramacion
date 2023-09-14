{Ticketek dispone de un vector desordenado con 10.000 reservas. De cada reserva se tiene el  DNI del cliente, código del evento, y cantidad de entradas.
Además se dispone de un árbol de eventos. De cada evento se tiene código y stock de entradas. El árbol está ordenado por código de evento.
Implemente un programa con:

Un módulo que ordene, por código de evento, los elementos del vector de reservas. Es necesario este ordenamiento para procesar con mayor
eficiencia la información de las reservas en el siguiente inciso.

Un módulo que reciba vector de reservas ordenado y el árbol de eventos. Recorrer el vector totalizando las reservas por código de evento
y actualizar el stock de entradas en el árbol de eventos.
}

program RattoCatalina;
const
  maxReservas=10000;
type
  reserva=record
    dniCliente:integer;
    codigo:integer;
    cantidadEntradas:integer;
  end;

  vector = array[1..maxReservas] of reserva;

  evento=record
    codigo:integer;
    stock:integer;
  end;

  arbol=^nodoA;
    nodoA=record
      dato:evento;
      HI:arbol;
      HD:arbol;
    end;



procedure ordenarReservas(var v: vector);
var
i, j: integer;
actual: reserva;
begin
    for i:=2 to maxReservas do begin
    	    actual:= v[i];
    	    j:= i-1;
    	    while ((j > 0) and (v[j].codigo > actual.codigo)) do begin
    		    v[j+1]:= v[j];
    		    j:= j - 1;
    	    end;
    	    v[j+1]:= actual;
    end;
end;

//Un módulo que reciba vector de reservas ordenado y el árbol de eventos. Recorrer el vector totalizando las reservas por código de evento
//y actualizar el stock de entradas en el árbol de eventos.

procedure actualizarStock(var a:arbol; e:evento);
begin
	if(a = nil)then begin
		new(a);
		a^.dato.stock:= 0;
		a^.dato.codigo:= e.codigo;
		a^.hi:= nil;
		a^.hd:= nil;
	end
	else
		if (a^.dato.codigo = e.codigo) then
			a^.dato.stock:= a^.dato.stock - e.stock
		else
			if (e.codigo < a^.dato.codigo) then
				actualizarStock(a^.HI, e)
			else
				actualizarStock(a^.HD, e);
end;


procedure recorrerVector(var v:vector);
var i:integer;
codigoEvento:integer;
total:integer;
e:evento;
a:arbol;
begin
    total:=0;
    for i:=1 to maxReservas do begin
          codigoEvento:=v[i].codigo;
          if(v[i].codigo=codigoEvento)then
              total:=total+1;
    end;
    actualizarStock(a,e);
end;


var
a:arbol;
v:vector;

begin
a:=nil;
cargarVector(v); //se dispone
cargarArbol(a); //se dispone
ordenarReservas(v);
recorrerVector(v);

end.

