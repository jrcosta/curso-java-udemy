package entities;

public class ClassExercicioPensao {

        private String nome;
        private String email;

        public ClassExercicioPensao(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String toString() {
            return nome + ", " + email;
        }

}
