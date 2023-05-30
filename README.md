# Dictionary 📖

<p align="center">
    <img src="https://raw.githubusercontent.com/wagarcdev/Dictionary/master/blob/page_6_dictionary.jpg" alt="Apresentação do Pokédex" style="width: 100%">
</p>

## Descrição 📄

O Dictionary é um aplicativo que implementa a API do Dicionário e armazena em cache os resultados das palavras pesquisadas anteriormente. O aplicativo utiliza a arquitetura MVVM e o Jetpack Compose para fornecer uma interface de usuário moderna e intuitiva.

A implementação do cache consiste em tornar o Repositório a "Fonte Única da Verdade" e fazer todas as consultas no banco de dados local. Os dados são buscados na API apenas quando o banco de dados não possui os dados em cache.

As consultas na API são armazenadas no banco de dados local usando o Room.

## Recursos Principais ⭐️

- 📚 Integração com a API do Dicionário: O aplicativo utiliza a API do Dicionário para buscar definições de palavras e exibir os resultados aos usuários.

- 🗃️ Implementação de Cache: O Dictionary utiliza o conceito de cache para armazenar os resultados das palavras previamente pesquisadas, tornando as consultas mais rápidas e eficientes.

- 📦 Room: Utilizado para criar e gerenciar o banco de dados local no aplicativo, permitindo o armazenamento das consultas e resultados de palavras.

- 📱 MVVM: O aplicativo segue a arquitetura MVVM (Model-View-ViewModel) para uma separação clara de responsabilidades e facilitar a manutenção e testabilidade do código.

- 🚀 Jetpack Compose: O Dictionary utiliza o Jetpack Compose para criar a interface de usuário, fornecendo uma experiência moderna, flexível e responsiva.

## Uso 🚀

Certifique-se de ter o Android Studio configurado em seu ambiente de desenvolvimento. Para executar o aplicativo:

1. Clone este repositório em sua máquina local.
2. Abra o projeto no Android Studio.
3. Aguarde a sincronização do projeto e a instalação das dependências.
4. Execute o aplicativo em um dispositivo Android ou emulador.

## Contribuição 🤝

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, fique à vontade para abrir uma [issue](https://github.com/seu-usuario/Dictionary/issues) ou enviar um [pull request](https://github.com/seu-usuario/Dictionary/pulls).

## Autor 👤

Este projeto foi desenvolvido por [Wagner Arcieri](https://github.com/wagarcdev).

## Licença 📜

Este projeto está licenciado sob a [MIT License](https://opensource.org/licenses/MIT).
