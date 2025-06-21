package cl.marco.eli.ms_customer_bff.clients;

public record CustomerDTO(
        Long id,
        String email,
        String firstName,
        String lastName
) {
}
