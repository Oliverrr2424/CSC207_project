# CSC207_project
### Main Package (`main.chessboxing`)

1. **Controller Package (`controller`)**
    - **BoxingController**: Likely responsible for managing the boxing portion of the game, handling events and actions 
    specific to boxing rounds (e.g., punches, stamina calculations).
    - **ChessController**: This class would manage the chess portion of the game, dealing with moves, turn management, 
   and chess-specific logic.
    - **GameController**: Acts as the primary controller for the game, coordinating transitions between chess and boxing 
   rounds and managing the overall game flow.

2. **Model Package (`model`)**
    - **Boxing**: Represents the boxing component or state, likely storing data related to boxing matches, such as 
    rounds, points, or player stamina.
    - **GameMode**: Represents the game mode (chess, boxing, etc.), possibly storing or managing the current game state, 
   round, or phase.
    - **Match**: Could represent a complete chessboxing match, holding data on rounds, scores, or player stats across 
   the entire game.
    - **Pieces (sub-package)**:
        - **King**: Represents the King chess piece, likely including movement rules and specific properties for this 
      piece.
        - **Queen**: Represents the Queen chess piece, with its movement rules and specific properties.

3. **Player Package (`Player`)**
    - **Player**: Stores information about a player, such as their name, stats, scores, and potentially other attributes 
   related to their performance in both chess and boxing.

4. **Utils Package (`utils`)**
    - **Notification**: Likely a utility for creating or displaying notifications to the player, such as alerts for 
   checkmate, knockout, or end-of-round events.
    - **Timer**: Manages timing for rounds or moves, especially critical in chessboxing, where each segment might be 
   time-bound.

5. **View Package (`view`)**
    - **BoxingView**: The view layer for the boxing phase, likely responsible for rendering the boxing interface, 
   displaying punches, stamina bars, and other boxing-related visuals.
    - **ChessView**: The view layer for the chess phase, rendering the chessboard, pieces, and moves.
    - **GameView**: An overall game view that could manage switching between BoxingView and ChessView, providing a 
   unified interface for the player.

