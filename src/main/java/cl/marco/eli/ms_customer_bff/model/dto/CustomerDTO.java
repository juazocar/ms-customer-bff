package cl.marco.eli.ms_customer_bff.model.dto;


public record CustomerDTO(
        Long id,
        String email,
        String firstName,
        String lastName
) {
}
