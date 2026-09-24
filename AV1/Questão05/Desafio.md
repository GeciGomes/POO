### Justificativa (Passo a Passo)

Valores iniciais: **x = 3**, **y = 5**, **z = 7**

---

#### 1ª Iteração do Laço (`do-while`):
1. **Modificação das variáveis:**
   * `++x`: incrementa **x** de 3 para **4**.
   * `y--`: decrementa **y** de 5 para **4**.
   * `--z`: decrementa **z** de 7 para **6**.
2. **Avaliação da condição `if (x % 2 == 0)`:**
   * **4 % 2 == 0** é **Verdadeiro** (4 é par).
3. **Execução do `continue`:**
   * O comando `continue` ignora o restante do bloco (pula a impressão no console e a checagem do `break`) e salta direto para a verificação do laço: `while (z > 0)`.
4. **Condição do laço `while (z > 0)`:**
   * **6 > 0** é **Verdadeiro**. O laço continua para a 2ª iteração.

---

#### 2ª Iteração do Laço:
1. **Modificação das variáveis:**
   * `++x`: incrementa **x** de 4 para **5**.
   * `y--`: decrementa **y** de 4 para **3**.
   * `--z`: decrementa **z** de 6 para **5**.
2. **Avaliação da condição `if (x % 2 == 0)`:**
   * **5 % 2 == 0** é **Falso** (5 é ímpar).
3. **Impressão no console:**
   * Executa o `System.out.println`, imprimindo: `x=5, y=3, z=5`
4. **Avaliação da condição `if (y < 2)`:**
   * **3 < 2** é **Falso**. O `break` não é executado.
5. **Condição do laço `while (z > 0)`:**
   * **5 > 0** é **Verdadeiro**. O laço continua para a 3ª iteração.

---

#### 3ª Iteração do Laço:
1. **Modificação das variáveis:**
   * `++x`: incrementa **x** de 5 para **6**.
   * `y--`: decrementa **y** de 3 para **2**.
   * `--z`: decrementa **z** de 5 para **4**.
2. **Avaliação da condição `if (x % 2 == 0)`:**
   * **6 % 2 == 0** é **Verdadeiro** (6 é par).
3. **Execução do `continue`:**
   * Pula a impressão e a checagem do `break`, indo para a verificação do laço: `while (z > 0)`.
4. **Condição do laço `while (z > 0)`:**
   * **4 > 0** é **Verdadeiro**. O laço continua para a 4ª iteração.

---

#### 4ª Iteração do Laço:
1. **Modificação das variáveis:**
   * `++x`: incrementa **x** de 6 para **7**.
   * `y--`: decrementa **y** de 2 para **1**.
   * `--z`: decrementa **z** de 4 para **3**.
2. **Avaliação da condição `if (x % 2 == 0)`:**
   * **7 % 2 == 0** é **Falso** (7 é ímpar).
3. **Impressão no console:**
   * Executa o `System.out.println`, imprimindo: `x=7, y=1, z=3`
4. **Avaliação da condição `if (y < 2)`:**
   * **1 < 2** é **Verdadeiro**.
5. **Execução do `break`:**
   * O comando `break` encerra imediatamente a execução do laço `do-while`.