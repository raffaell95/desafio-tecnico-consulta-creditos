package raffa.com.consulta.credito.configurations.kafka;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class RequestLoggingFilter extends OncePerRequestFilter {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public RequestLoggingFilter(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        String method = request.getMethod();
        String path = request.getRequestURI();
        String log = "Request: " + method + " " + path + " - " + LocalDateTime.now();

        kafkaTemplate.send("logs-api", log); // Envia para tópico logs-api

        filterChain.doFilter(request, response);
    }
}




