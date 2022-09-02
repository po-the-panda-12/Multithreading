# I wrote 10,000 lines of code!


Clickbait aside, the purpose of this bit of code was to demonstrate the efficiency of multithreading over standard printing. 
I didn't really write 10,000 lines of code but used a for loop to simulate that.

<br>
After running 20 simulations of 10,000 lines the resutls averaged 95(ms) for simple printing and 52(ms) for multithreading. 
Even though the time is still very little, it shows that multithreading is nearly twice as fast as simple printing. 
<br><br><br>
Now, because of local caching, differnet number of simulations will get different resutls as below. 
<br><br>

| Type/Simulation  | 1 | 20   |
| ------------- | ------------- | ------------- |
| Basic  | 162 ms  | 95 ms  |
| Multithread | 63 ms  | 52 ms  |

<br>
I found multithreading more consistent simply more efficient for simple printing programs where the ordering doesn't matter much.
