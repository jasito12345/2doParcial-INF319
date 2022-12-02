namespace ClassLibrary2

module Say =
    let hello name =
        printfn "Hello %s" name

// Learn more about F# at http://docs.microsoft.com/dotnet/fsharp
// See the 'F# Tutorial' project for more help.

// UNIV. LEONEL ALVARO CHAMACA LIMA CI_6853618 LP

module pregunta4 =
let fiboIterativo n = 
    match n with 
    | 0 -> 0
    | n -> 
        let mutable last = 0
        let mutable next = 1
        for i in 1 .. (n - 1) do
            let temp = last + next
            last <- next
            next <- temp
            printfn "%i" temp
        next
//FIBONACCI RECURSIVO
let rec fib4(n: int):int = 
    match n with
    | 1 | 2 -> n  
    | n -> fib4 (n-1) + fib4 (n - 2)

let function1(n: int) =
  for i in 1 .. n do
    fib4 i |> printfn "%i" |> ignore



[<EntryPoint>]
let main argv =    
    // PREGUNTA 1
    //Realice la serie Fibonacci estructurada y recursiva de tres términos hasta n 
    printf "%s" "FIBONACCI ITERATIVO " 
    //iterativo
    fiboIterativo 7 
    printf "%s " "FIBONACCI RECURSIVO " 
    //recursivo
    function1(7)
    0
    