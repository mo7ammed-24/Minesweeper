fun main() {
    print(minesweeper(mutableListOf(mutableListOf(true, false, false), mutableListOf(false, true, false), mutableListOf(false, false, false))))
}

fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {

    var finalList=mutableListOf<MutableList<Int>>()
    for(i in 0 until matrix.size){
        var myList=mutableListOf<Int>()
        for(j in 0 until matrix[i].size){
            var element=checking(i,j,matrix)
            myList.add(element)
        }
        finalList.add(myList)
    }
    return finalList
}

fun checking(i:Int,j:Int,matrix: MutableList<MutableList<Boolean>>):Int{
    var count=0

    if(i>-1 && i<matrix.size )
        if(j+1>-1 && j+1<matrix[i].size)
            if(matrix[i][j+1]==true)
                count++

    if(i>-1 && i<matrix.size )
        if(j-1>-1 && j-1<matrix[i].size)
            if(matrix[i][j-1]==true)
                count++

    if(i-1>-1 && i-1<matrix.size )
        if(j-1>-1 && j-1<matrix[i-1].size)
            if(matrix[i-1][j-1]==true)
                count++

    if(i-1>-1 && i-1<matrix.size )
        if(j>-1 && j<matrix[i-1].size)
            if(matrix[i-1][j]==true)
                count++

    if(i-1>-1 && i-1<matrix.size )
        if(j+1>-1 && j+1<matrix[i-1].size)
            if(matrix[i-1][j+1]==true)
                count++
    if(i+1>-1 && i+1<matrix.size )
        if(j-1>-1 && j-1<matrix[i+1].size)
            if(matrix[i+1][j-1]==true)
                count++
    if(i+1>-1 && i+1<matrix.size )
        if(j>-1 && j<matrix[i].size)
            if(matrix[i+1][j]==true)
                count++
    if(i+1>-1 && i+1<matrix.size )
        if(j+1>-1 && j+1<matrix[i+1].size)
            if(matrix[i+1][j+1]==true)
                count++

    return count

}
