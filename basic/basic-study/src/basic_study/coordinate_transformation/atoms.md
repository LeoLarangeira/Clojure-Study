## Atoms 

Para concluir esse exercicio foi necessário estudar um pouco sobre atoms em clojure, além de closure. Para um pequeno resumo e poder esclarecer dúvidas em futuro, segue aqui a humilde explicação.

Os atoms são uma maneira de representar valores mutávies de forma segura e controlada. Eles são úteis quando você precisa compartilhar estado entre diferentes threads em um ambiente concorrente.

Aqui está como eles funcionam:

- 1. __Imbutabilidade Primária__: Em Clojure, a imutabilidade é a norma. A maioria dos valores são imutáveis, o que significa que uma vez criados, eles não podem ser alterados. No entanto , em certos casos, você precisa de mutabilidade controlada, e ai que entram os atoms.
- 2. __Valor Atômico__: Um atom em Clojure encapsula um valor que pode ser alterado. Esse valor é imutável, mas você pode trocar o valor armazenado dentro do atom.
- 3. __Alteração Segura__: A única maneira de alterar o valor de um atom é usando a função `swap!` ou `reset!`. Ambas garantem que as alterações sejam seguras em ambientes concorrentes. 
- 4. __Função `swap`!__: Esta função é usada para alterar o valor armazenado em um atom. Ele aceita o atom como primeiro argumento e uma função como segundo argumento. A função é aplicada ao valor atual do atom, e o resultado é armazenado de volta no atom.
- 5. __Função `reset`!__: Ao contrário da função `swap!`, a função `reset!` simplesmente define um novo valor para o atom, ignorando o valor anterior.
- 6. __Controle Concorrente__: Clojure garante que as alterações em atoms sejam atomicamente consistentes ,mesmo em um ambiente concorrente, evitando condições de corrida e garantindo que todas as threads vejam uma versão coerente do estado.