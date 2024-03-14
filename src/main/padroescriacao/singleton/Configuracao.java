package main.padroescriacao.singleton;

    public class Configuracao {

        private Configuracao() {}
        private static Configuracao instance = new Configuracao();

        public static Configuracao getInstance() {
            return instance;
        }

        private String nivelLog;
        private String formatoData;

        public String getNivelLog() {
            return nivelLog;
        }

        public void setNivelLog(String nivelLog) {
            this.nivelLog = nivelLog;
        }

        public String getFormatoData() {
            return formatoData;
        }

        public void setFormatoData(String formatoData) {
            this.formatoData = formatoData;
        }
    }
