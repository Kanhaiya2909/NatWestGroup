
POST; localhost:8080/api/games
BODY: {
    "name":"AbhitabhKrPandey"
}

RESPONSE BODY: Player 1 joined: AbhitabhKrPandey Game ID is: c4765ecf-a142-489e-ab99-38e78ca4b8ba
-----------------------------------------------------------------------------------------------------------------------------------------------

POST; localhost:8080/api/games/c4765ecf-a142-489e-ab99-38e78ca4b8ba/join
BODY: {
    "name":"RanjanKrPandey"
}

RESPONSE BODY: Player 2 joined: RanjanKrPandey
------------------------------------------------------------------------------------------------------------------------------------------------
POST; localhost:8080/api/games/c4765ecf-a142-489e-ab99-38e78ca4b8ba/move
BODY: {
    "name":"AbhitabhKrPandey",
    "move":"PAPER"
}

RESPONSE BODY: Player 1: AbhitabhKrPandey made a move: PAPER
-------------------------------------------------------------------------------------------------------------------------------------------------

POST; localhost:8080/api/games/c4765ecf-a142-489e-ab99-38e78ca4b8ba/move
BODY: {
    "name":"RanjanKrPandey",
    "move":"PAPER"
}

RESPONSE BODY: Player 2: RanjanKrPandey made a move PAPER
GameId: c4765ecf-a142-489e-ab99-38e78ca4b8ba
Game state: STARTED
Player 1: AbhitabhKrPandey
Player 1 move: PAPER
Player 2: RanjanKrPandey
Player 2 move: PAPER
RESULT: Player 1 - DRAW, Player 2 - DRAW
--------------------------------------------------------------------------------------------------------------------------------------------------
