package com.crud.tasks.controller;

import com.crud.tasks.domain.CreatedTrelloCardDto;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.trello.facade.TrelloFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/trello")
public class TrelloController {

    // @Autowired
    // private TrelloClient trelloClient;

    // @Autowired
    // private TrelloService trelloService;

    @Autowired
    private TrelloFacade trelloFacade;

    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloFacade.fetchTrelloBoards();
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTrelloCard")
    public CreatedTrelloCardDto createTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloFacade.createCard(trelloCardDto);
    }
}


 //   @RequestMapping(method = RequestMethod.POST, value = "createTrelloCard")
 //   public CreatedTrelloCardDto createdTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
 //       return trelloService.createdTrelloCard(trelloCardDto);
 //   }
//
 //   @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
 //   public List<TrelloBoardDto> getTrelloBoards() {
 //       return trelloService.fetchTrelloBoards();
// }

//    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
//    public void getTrelloBoards() {
//        // GET request
//        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();
//
//        trelloBoards.forEach(trelloBoardDto -> {
//
//            System.out.println(trelloBoardDto.getName() + " - " + trelloBoardDto.getId());
//
//            System.out.println("This board contains lists: ");
//
//            trelloBoardDto.getLists().forEach(trelloList ->
//                    System.out.println(trelloList.getName() + " - " + trelloList.getId() + " - " + trelloList.isClosed()));
//
//        });
//    }


//    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
//    public void getTrelloBoards() {
//
//        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();
//
//        Optional.ofNullable(trelloBoards);
//
//        trelloBoards.stream()
//                .filter(trelloBoardDto -> trelloBoardDto.getName().equals("Kodilla"))
//                .forEach(trelloBoardDto -> System.out.println(trelloBoardDto.getId() + " " + trelloBoardDto.getName()));
//
//    }
