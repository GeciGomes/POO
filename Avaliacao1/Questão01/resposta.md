a)
Uma classe abstrata é uma classe que não pode ser instanciada diretamente e serve como um modelo (superclasse) para outras classes. Ela pode conter métodos abstratos (sem implementação, que devem ser obrigatoriamente sobrescritos pelas subclasses) e métodos concretos (com implementação).

b)
static (t1): Pertence à classe e não às instâncias. O valor de t1 é compartilhado por todos os objetos da classe.
final (t2): Define uma constante. O valor de t2 é atribuído apenas uma vez e não pode ser alterado após a inicialização.

c)
Garante o encapsulamento da classe. Isso permite controlar e validar a leitura e a alteração dos dados, oculta os detalhes internos da implementação e impede que o estado do objeto seja modificado de forma indevida ou inconsistente por código externo.

d)
public: O membro pode ser acessado por qualquer outra classe, independentemente do pacote.
private: O membro é visível e acessível apenas dentro da própria classe em que foi declarado.
protected: O membro é acessível por classes do mesmo pacote e por subclasses (mesmo que estejam em pacotes diferentes).