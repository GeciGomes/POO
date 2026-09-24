1. **Atribuição de tipo incompatível a um campo `final` (Linha 7):**
   * **Erro:** `codigo = "A100";`
   * **Justificativa:** O atributo `codigo` é do tipo `int`, mas o construtor tenta atribuir uma `String` (`"A100"`).

2. **Sombreamento de variável / Falta do `this` (Linha 8):**
   * **Erro:** `nome = nome;`
   * **Justificativa:** Atribui o parâmetro do construtor a ele mesmo. Para alterar o atributo do objeto, o correto é utilizar `this.nome = nome;`.

3. **Uso de atributo de instância em método estático (Linha 13):**
   * **Erro:** `System.out.println("Produto: " + nome);` dentro de `aplicarDesconto`
   * **Justificativa:** Métodos estáticos (`static`) pertencem à classe e não têm acesso direto a atributos de instância não estáticos (`nome`).

4. **Tentativa de alterar atributo `final` via Setter (Linha 17):**
   * **Erro:** `this.codigo = novoCodigo;` em `setCodigo`
   * **Justificativa:** Atributos do tipo `final` não podem ser modificados após serem inicializados no construtor.

5. **Incompatibilidade no retorno do método Getter (Linhas 20 e 21):**
   * **Erro:** `public void getPreco() { return preco; }`
   * **Justificativa:** O método foi declarado como `void` (sem retorno), porém utiliza a instrução `return` para devolver um valor. O retorno correto deve ser `double`.

6. **Reatribuição de atributo `final` no `main` (Linha 27):**
   * **Erro:** `p1.codigo = 500;`
   * **Justificativa:** Tentativa de alterar o valor do atributo `codigo` fora da inicialização do construtor.

7. **Atribuição de retorno `void` a uma variável (Linha 29):**
   * **Erro:** `double valor = p1.getPreco();`
   * **Justificativa:** Não é possível armazenar o resultado de um método com tipo de retorno `void` dentro de uma variável `double`.

8. **Acesso direto a membro privado (Linha 26):**
   * **Erro:** `p1.preco = 150.0;`
   * **Justificativa:** O atributo `preco` possui visibilidade `private` e não pode ser acessado diretamente a partir de outra classe ou do método `main`.