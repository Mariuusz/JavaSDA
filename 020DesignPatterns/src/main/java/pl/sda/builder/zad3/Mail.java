package pl.sda.builder.zad3;

import java.util.Date;

public class Mail {

    private String tresc, nadawca, nazwaSerwera, nazwaSkrzynki;
    private boolean czySzyfr, isSpam;
    private Type type;
    private Date dataNadania, dataOdbioru;

    private Mail(String tresc, String nadawca, String nazwaSerwera, String nazwaSkrzynki, boolean czySzyfr, boolean isSpam, Type type, Date dataNadania, Date dataOdbioru) {
        this.tresc = tresc;
        this.nadawca = nadawca;
        this.nazwaSerwera = nazwaSerwera;
        this.nazwaSkrzynki = nazwaSkrzynki;
        this.czySzyfr = czySzyfr;
        this.isSpam = isSpam;
        this.type = type;
        this.dataNadania = dataNadania;
        this.dataOdbioru = dataOdbioru;
    }

    public String getTresc() {
        return tresc;
    }

    public String getNadawca() {
        return nadawca;
    }

    public String getNazwaSerwera() {
        return nazwaSerwera;
    }

    public String getNazwaSkrzynki() {
        return nazwaSkrzynki;
    }

    public boolean isCzySzyfr() {
        return czySzyfr;
    }

    public boolean isSpam() {
        return isSpam;
    }

    public Date getDataNadania() {
        return dataNadania;
    }

    public Date getDataOdbioru() {
        return dataOdbioru;
    }

    public static class Builder{
        private String tresc;
        private String nadawca;
        private String nazwaSerwera;
        private String nazwaSkrzynki;
        private boolean czySzyfr;
        private boolean isSpam;
        private Type type;
        private Date dataNadania;
        private Date dataOdbioru;

        public Builder setTresc(String tresc) {
            this.tresc = tresc;
            return this;
        }

        public Builder setNadawca(String nadawca) {
            this.nadawca = nadawca;
            return this;
        }

        public Builder setNazwaSerwera(String nazwaSerwera) {
            this.nazwaSerwera = nazwaSerwera;
            return this;
        }

        public Builder setNazwaSkrzynki(String nazwaSkrzynki) {
            this.nazwaSkrzynki = nazwaSkrzynki;
            return this;
        }

        public Builder setCzySzyfr(boolean czySzyfr) {
            this.czySzyfr = czySzyfr;
            return this;
        }

        public Builder setIsSpam(boolean isSpam) {
            this.isSpam = isSpam;
            return this;
        }

        public Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public Builder setDataNadania(Date dataNadania) {
            this.dataNadania = dataNadania;
            return this;
        }

        public Builder setDataOdbioru(Date dataOdbioru) {
            this.dataOdbioru = dataOdbioru;
            return this;
        }

        public Mail createMail() {
            return new Mail(tresc, nadawca, nazwaSerwera, nazwaSkrzynki, czySzyfr, isSpam, type, dataNadania, dataOdbioru);
        }
    }
}