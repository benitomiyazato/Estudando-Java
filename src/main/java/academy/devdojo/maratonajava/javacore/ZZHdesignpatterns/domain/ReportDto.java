package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

public class ReportDto {
    private String aircraftName;
    private String personName;
    private Country country;
    private Currency currency;

    private ReportDto(String aircraftName, String personName, Country country, Currency currency) {
        this.aircraftName = aircraftName;
        this.personName = personName;
        this.country = country;
        this.currency = currency;
    }

    public static final class ReportDtoBuilder {
        private String aircraftName;
        private String personName;
        private Country country;
        private Currency currency;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDto build() {
            return new ReportDto(aircraftName, personName, country, currency);
        }
    }

    @Override
    public String toString() {
        return "ReportDto [aircraftName=" + aircraftName + ", country=" + country + ", currency=" + currency
                + ", personName=" + personName + "]";
    }
}
