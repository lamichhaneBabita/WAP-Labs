$(function () {
    var PUZZLESIZE = 4;
    var empty_row = 3;
    var empty_col = 3;      
    var TILE_ZIZE = 100;
    initial();

    function initial() {
        $('#puzzlearea div').each(function (idx, e) {
            // calculate x and y for this piece
            var x = ((idx % PUZZLESIZE) * TILE_ZIZE);
            var y = (Math.floor(idx / PUZZLESIZE) * TILE_ZIZE);

            $(this).attr('id', "square_" + y / TILE_ZIZE + "_" + x / TILE_ZIZE).addClass('puzzlepiece').css({
                'left': x + 'px',
                'top': y + 'px',
                'background-image': 'url("background.jpg")',
                'background-position': -x + 'px ' + (-y) + 'px'
            }).mouseover(moveHighlight).mouseout(resetHighlighted).click(moveSquare);
        });

        $('#shufflebutton').click(shuffle);
    }

    function moveSquare() {
        if (isMoveable(this)) {
            var square_row = parseInt($(this).css('top')) / TILE_ZIZE;
            var square_col = parseInt($(this).css('left')) / TILE_ZIZE;

            $(this).css('left', empty_col * TILE_ZIZE);
            $(this).css('top', empty_row * TILE_ZIZE);

            empty_col = square_col;
            empty_row = square_row;
        }
    }

    function isMoveable(square) {
        var square_left = parseInt($(square).css("left"));
        var square_top = parseInt($(square).css("top"));

        var empty_left = empty_col * TILE_ZIZE;
        var empty_top = empty_row * TILE_ZIZE;

        var moveable = false;
        if (square_left === empty_left) {
            if (square_top === empty_top - TILE_ZIZE || square_top === empty_top + TILE_ZIZE) {
                moveable = true;
            }
        } else if (square_top === empty_top) {
            if (square_left === empty_left - TILE_ZIZE || square_left === empty_left + TILE_ZIZE) {
                moveable = true;
            }
        }

        return  moveable;
    }
    function shuffle() {
        for (var i = 0; i <= 1000; i++) {
            possible_moveable_squares_ids = [
                "square_" + empty_row + "_" + (empty_col - 1),
                "square_" + empty_row + "_" + (empty_col + 1),
                "square_" + (empty_row + 1) + "_" + empty_col,
                "square_" + (empty_row - 1) + "_" + empty_col
            ];

            for (var idx = 0; idx < possible_moveable_squares_ids.length; idx++) {
                
                var random_index = Math.floor(Math.random() * possible_moveable_squares_ids.length);
                var square_id = possible_moveable_squares_ids[random_index];
                if ($("#" + square_id).length !== 0) {
                    $("#" + square_id).trigger('click');
                }

            }
        }
    }
    

    function resetHighlighted() {
        $(this).removeClass("movablepiece");
    }
    function moveHighlight() {
        if (isMoveable(this)) {
            $(this).addClass("movablepiece");
        }
    }

    
});