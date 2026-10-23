1b — Herança
Cliente c = new ClienteVip(...) compila: todo ClienteVip é um Cliente, então o filho cabe numa referência do pai (upcast).
ClienteVip v = new Cliente(...) não compila: um Cliente não é um ClienteVip (nem todo cliente é VIP).
2b — Classes abstratas
Produto é abstrata e não pode ser instanciada, pois não tem preço final definido. Isso obriga cada subclasse concreta a implementar sua regra de preço e evita produtos "sem tipo".
O método abstrato está declarado em Produto, o que basta para compilar. Em execução, o objeto é de uma subclasse concreta que o implementou, e a JVM chama essa versão (ligação dinâmica).
3c — Interfaces
ProdutoFisico já estende Produto e Java não tem herança múltipla de classes. Além disso, "ser entregável" é uma capacidade, não um tipo de produto.
Uma classe implementa várias interfaces, mas estende só uma classe abstrata. Classe abstrata pode ter atributos de instância e construtor; interface não.
4b — Polimorfismo
Teclado: 110.0
E-book Java: 47.5
Streaming: 108.0

Quem decide é a ligação dinâmica: a JVM executa o calcularPrecoFinal() do tipo real do objeto, não do tipo da variável (Produto).

4c — Referência × objeto

Não compila: p1 é do tipo Produto, que não tem calcularFrete. Correção:

java
((Entregavel) p1).calcularFrete("60000-000");

O tipo da referência define o que pode ser chamado na compilação; o tipo do objeto define qual implementação roda na execução.

5b — try/catch/finally
B: Estoque insuficiente para Teclado. Disponível: 3
C
D

A exceção ocorre antes do println("A"). O catch imprime o B, o finally sempre executa (C) e o fluxo continua (D).

5c — Verificada × não verificada

EstoqueInsuficienteException é verificada (Exception), então o compilador exige tratamento; PagamentoRecusadoException é não verificada (RuntimeException), então é opcional. Use verificada quando o chamador pode se recuperar (pedir outra quantidade) e não verificada para erros de programação ou tratamento centralizado.