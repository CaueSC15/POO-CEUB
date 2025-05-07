// Classe base
public class Pessoa {
    protected String nome;
    protected String cpfOuCnpj;
    protected String endereco;
    protected String telefone;
    protected String email;
}

// Cliente
public class Cliente extends Pessoa {
    private Date dataCadastro;
    private double limiteCredito;
}

// Fornecedor
public class Fornecedor extends Pessoa {
    private String razaoSocial;
    private String cnpj;
    private String setor;
}

// Empregado
public class Empregado extends Pessoa {
    private String matricula;
    private double salario;
}

// Vendedor (subclasse de Empregado)
public class Vendedor extends Empregado {
    private double comissao;
    private double metaVendas;
}

// Usuario de Acesso
public class UsuarioAcesso extends Pessoa {
    private String login;
    private String senha;
    private String nivelAcesso;
}
