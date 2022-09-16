package server.java;

import java.util.*;
import java.time.*;

public class EventDatabase {
  static Map<String, Event> eventsById;

  public static Map<String, Event> createDatabase() {
    eventsById = new HashMap<String, Event>() {
      {
        put("155119", new Event(
            "155119",
            LocalDate.of(2022, 9, 16),
            LocalDate.of(2022, 10, 16),
            0.0,
            5000,
            "Visita Gratuita ao Parque Municipal Américo Renné Giannetti",
            "O Parque Municipal Américo Renné Giannetti funciona de terça a domingo, das 8h às 17h.",
            "Parque Municipal Américo Renné Giannetti",
            "Av. Afonso Pena, 1377, Belo Horizonte - Minas Gerais",
            "1377",
            "Centro",
            "Belo Horizonte",
            "Minas Gerais",
            "01311-000"));
        put("1650917", new Event(
            "1650917",
            LocalDate.of(2022, 9, 18),
            LocalDate.of(2022, 9, 18),
            200.0,
            75000,
            "SENSACIONAL! Celebra - Shows de Gilberto Gil e Mayra Andrade",
            "Uma noite exclusiva com shows de dois grandes nomes da música mundial: Gilberto Gil e Mayra Andrade.",
            "Mineirão",
            "Av. Antônio Abrahão Caram, 1001 - São José, Belo Horizonte - MG, 31275-000",
            "1001",
            "São José",
            "Belo Horizonte",
            "Minas Gerais",
            "31275-000"));
        put("1506592", new Event(
            "1506592",
            LocalDate.of(2022, 9, 11),
            LocalDate.of(2022, 11, 5),
            0.0,
            10000,
            "Arena Rock Bar",
            "O MELHOR BAR DE ROCK DA GRANDE BH",
            "Arena Rock Bar",
            "Av. Babita Camargos, 199 - Cidade Industrial - Contagem - MG",
            "199",
            "Cidade Industrial",
            "Contagem",
            "Minas Gerais",
            "32210-180"));
        put("154146", new Event(
            "154146",
            LocalDate.of(2022, 9, 7),
            LocalDate.of(2022, 10, 16),
            200.0,
            15000,
            "RIVER ACQUA PARK",
            "O RIVER ACQUA PARK, POSSUI UMA DAS MAIORES PISCINAS DE ONDA DO PAÍS!",
            "River Park",
            "Sítio dos Quaresmeiras, Santa Bárbara - Minas Gerais",
            "",
            "",
            "Santa Bárbara",
            "Minas Gerais",
            "35960-000"));
        put("1555947", new Event(
            "1555947",
            LocalDate.of(2022, 11, 5),
            LocalDate.of(2022, 11, 7),
            744.0,
            100000,
            "Festival Rock the Mountain 2022 : 1º Final de Semana",
            "A 7ª edição do Rock the Mountain Festival acontecerá nos dias 05, 06, 12 e 13 de novembro 2022!",
            "Parque Municipal Prefeito Paulo Rattes",
            "Estr. União e Indústria, 10000 - Itaipava, Petrópolis - RJ, 25730-745",
            "10000",
            "Itaipava",
            "Petrópolis",
            "Rio de Janeiro",
            "25730-745"));
        put("151837", new Event(
            "151837",
            LocalDate.of(2022, 9, 16),
            LocalDate.of(2022, 10, 30),
            100.0,
            40000,
            "SAMPA SKY",
            "Imagina flutuar sobre a cidade de São Paulo, a uma altura de 150 metros do chão?",
            "Sampa Sky",
            "Praça Pedro Lessa, 110 - Ed. Mirante do Vale, São Paulo - São Paulo",
            "110",
            "Centro Histórico de São Paulo",
            "São Paulo",
            "São Paulo",
            "01032-030"));
        put("155253", new Event(
            "155253",
            LocalDate.of(2022, 9, 6),
            LocalDate.of(2022, 9, 25),
            79.90,
            30000,
            "Zooparque Itatiba - Ingressos 2022",
            "Fundado há mais de 20 anos, o Zooparque Itatiba é considerado o maior zoológico particular do Brasil.",
            "Zooparque Itatiba",
            "Paraíso das Aves - Av. ZooParque Itatiba, Rod. Dom Pedro I, KM 95.5, Itatiba - SP, 13254-762",
            "",
            "",
            "Itatiba",
            "São Paulo",
            "13254-762"));
        put("155698", new Event(
            "155698",
            LocalDate.of(2022, 9, 6),
            LocalDate.of(2022, 9, 30),
            20.0,
            70000,
            "Museu da Língua Portuguesa",
            "Venha conhecer as novas experiências da nossa exposição principal!",
            "Museu da Língua Portuguesa",
            "Praça da Luz, s/nº - Centro Histórico de São Paulo, São Paulo - SP, 01120-010",
            "",
            "Centro Histórico de São Paulo",
            "São Paulo",
            "São Paulo",
            "01120-010"));
        put("158024", new Event(
            "158024",
            LocalDate.of(2022, 9, 17),
            LocalDate.of(2022, 10, 2),
            180.0,
            200000,
            "PATATI PATATÁ CIRCO SHOW | TATUAPÉ",
            "A ALEGRIA ESTÁ DE VOLTA!",
            "PATATI PATATA CIRCO SHOW",
            "R. Uriel Gaspar, 149 - Belenzinho, São Paulo - SP, 03301-000",
            "149",
            "Belenzinho",
            "São Paulo",
            "São Paulo",
            "03301-000"));
        put("153495", new Event(
            "153495",
            LocalDate.of(2022, 9, 16),
            LocalDate.of(2022, 12, 26),
            70.0,
            500000,
            "Allianz Parque Experience Tour",
            "VIVA UMA EXPERIÊNCIA DE CAMPEÃO!",
            "Allianz Parque | Tour",
            "Rua Palestra Itália, 200 - Portão A - Perdizes, São Paulo - São Paulo",
            "200",
            "Perdizes",
            "Água Branca",
            "São Paulo",
            "05001-200"));
      }
    };

    return eventsById;
  }

  public static List<Event> getEvents() {
    return (List<Event>) eventsById.values();
  }

  public static Event getEventById(final String EVENT_ID) {
    return eventsById.get(EVENT_ID);
  }
}
