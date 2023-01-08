package guru.springframework.springbootchucknorris.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

    @Override
    public String getJoke() {
        ChuckNorrisQuotes joke = new ChuckNorrisQuotes();
        return joke.getRandomQuote();
    }
}
